/*
 * NewCategoryAction.java
 *
 * Created on September 22, 2001, 1:31 AM
 */

package org.cayambe.web.admin.action;

/**
 *
 * @author  jon rose
 * @version 
 */

import java.io.IOException;
import java.util.Hashtable;
import java.util.Locale;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.util.MessageResources;
import org.cayambe.core.CategoryVO;
import org.cayambe.util.CayambeActionMappings;
import org.cayambe.web.admin.form.*;

public final class NewCategoryAction extends Action {


    public ActionForward perform(ActionMapping mapping, ActionForm form, HttpServletRequest request,
        HttpServletResponse response)
        throws IOException, ServletException {

		String worked = CayambeActionMappings.SUCCESS;

		CategoryActionForm caf = (CategoryActionForm)form;
		CategoryVO categoryVO = new CategoryVO();
		categoryVO.setId(new Long(caf.getCategoryId()));
		request.setAttribute("categoryVO",categoryVO);

		ListCategoriesAction lca = new ListCategoriesAction();
		lca.ProcessRequest( form, request);

        return (mapping.findForward(worked));

    }

}