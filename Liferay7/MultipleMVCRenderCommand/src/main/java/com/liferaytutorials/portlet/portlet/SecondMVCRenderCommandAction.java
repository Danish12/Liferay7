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
	       "mvc.command.name=secondRenderURL"
	    },
	    service = MVCRenderCommand.class
)
public class SecondMVCRenderCommandAction implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		String JSP = "/second_url.jsp";
		System.out.println("SecondMVCRenderCommandAction.render()");
		return JSP;
	}

}
