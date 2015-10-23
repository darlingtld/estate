package estate.controller;

import com.alibaba.fastjson.JSONObject;
import estate.pojo.User;
import estate.pojo.response.Message;
import estate.pojo.response.Response;
import estate.pojo.response.State;
import estate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "login", method = RequestMethod.POST, headers = "content-type=application/json")
    public
    @ResponseBody
    Response login(@RequestBody JSONObject loginStub) {
        String username = loginStub.getString("username");
        String password = loginStub.getString("password");
        User user = userService.login(username, password);
        if (user != null) {
            return new Response(State.SUCCESS, Message.CODE_01, user);
        } else {
            return new Response(State.ERROR, Message.CODE_98, null);
        }
    }
}