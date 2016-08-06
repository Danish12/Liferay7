package com.liferaytutorials.portlet.portlet;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferaytutorials.portlet.constants.PortletKeys;

@Component(
	    immediate = true,
	    property = {
	       "javax.portlet.name=" + PortletKeys.NAME,
	       "mvc.command.name=firstRenderURL"
	    },
	    service = MVCRenderCommand.class
)
public class FristMVCRenderCommandAction implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		String JSP = "/first_url.jsp";
		System.out.println("FristMVCRenderCommandAction.render()");
		return JSP;
	}

}
