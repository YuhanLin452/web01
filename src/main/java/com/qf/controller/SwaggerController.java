package com.qf.controller;

import com.qf.domain.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SwaggerController {
    /**
     *
     * @param id
     * @return
     * Resuful 类型
     * get 方式用来获取数据的，只是用来查询数据，不对服务器的数据做任何的修改，新增，删除等操作。
     * post 方式是对服务器的数据做改变，常用来数据的提交，新增操作。
     * delete 方式请求用来删除服务器的资源
     * put 方式put的侧重点在于对于数据的修改操作，但是post侧重于对于数据的增加。
     */
    @RequestMapping(value = "/user/{id}" , method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "根据用户编号获取用户姓名",notes = "test:仅有1和2有正确返回")
    @ApiImplicitParam(paramType = "query", name = "id",value = "用户id",required = true, dataType = "int")
    public String getUser(@PathVariable("id") Integer id){
        return "nihao";
    }

    @RequestMapping(value = "/user" , method = RequestMethod.DELETE)
    @ResponseBody
    @ApiOperation(value = "根据用户编号获取用户姓名",notes = "test:仅有1和2有正确返回")
    @ApiImplicitParam(paramType = "query", name = "id",value = "用户id",required = true, dataType = "int")
    public String deleteUser(@RequestParam Integer id){
        System.out.println(id);
        return "nihao删除成功";
    }

    @RequestMapping(value = "/user" , method = RequestMethod.POST)
    @ApiOperation(httpMethod = "POST",value = "新增用户接口",notes = "新增用户")
    @ResponseBody
    //@ApiImplicitParam(paramType = "query", name = "id",value = "用户id",required = true, dataType = "int")
    public String insertUser(@RequestBody @ApiParam User user){
        System.out.println(user);
        return "新增";
    }
}
