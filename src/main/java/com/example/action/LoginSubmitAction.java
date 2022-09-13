package com.example.action;

import com.example.form.LoginForm;
import com.example.form.LoginSubmitForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class LoginSubmitAction extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) throws Exception {

        LoginSubmitForm loginSubmitForm = (LoginSubmitForm) form;
        Map<String, String> user = (Map<String, String>) FakeData.data.get(loginSubmitForm.getUsername());
        loginSubmitForm.setFullName(user.get("full_name"));

        return mapping.findForward("success");
    }

}