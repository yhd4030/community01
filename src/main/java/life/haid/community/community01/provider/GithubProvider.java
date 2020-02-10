package life.haid.community.community01.provider;




import com.alibaba.fastjson.JSON;
import life.haid.community.community01.dto.AccessTokenDTO;
import life.haid.community.community01.dto.GithubUser;
import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Component
public class GithubProvider {

    public String getAccessToken(AccessTokenDTO accessTokenDTO) {
        MediaType mediaType = MediaType.get("application/json; charset=utf-8");
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(JSON.toJSONString(accessTokenDTO), mediaType);
        Request request = new Request.Builder()//下面是调用方法
                .url("https://github.com/login/oauth/access_token")//授权链接
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            String string = response.body().string();
            String token = string.split("&")[0].split("=")[1];
            return token;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public GithubUser getUser(String accessToken){/*GithubUser个人信息类*/
        OkHttpClient client = new OkHttpClient();//建立http客户端
        Request request = new Request.Builder()/*request对象是来获取请求消息*/
                .url("https://api.github.com/user?access_token="+accessToken)
                .build();
        try {
            Response response = client.newCall(request).execute();/*execute方法同步地发送请求，直接返回 HTTP 响应。Response就是用来设置响应消息。*/
            String string = response.body().string();//获取个人信息
            GithubUser githubUser = JSON.parseObject(string, GithubUser.class);//将GithubUser需要的信息转为Object类型
            return githubUser;
        } catch (IOException e) {
        }
        return null;
    }
}