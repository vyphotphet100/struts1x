package com.example.action;

import com.example.form.HelloWorldForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public class HelloWorldAction extends Action {



    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) throws Exception {

        Map<String, String> user = new HashMap<>();
        user.put("username", "user1");
        user.put("password", "123456");
        user.put("full_name", "Cao Dinh Sy Vy");
        FakeData.data.put(user.get("username"), user);
        HelloWorldForm helloWorldForm = (HelloWorldForm) form;
        helloWorldForm.setGreeting("Welcome to our demo! Create fake data successfully!");

        return mapping.findForward("success");
    }

}