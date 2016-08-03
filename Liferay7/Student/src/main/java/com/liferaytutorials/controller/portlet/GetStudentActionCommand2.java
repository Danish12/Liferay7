package com.liferaytutorials.controller.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;

@Component(
	    immediate = true,
		property = {
		    	"javax.portlet.name=" + com.liferaytutorials.portlet.constant.StudentPortletKeys.PORTLET_NAME,
		    	"mvc.command.name=getStudentURL2"
		},
	    service = MVCActionCommand.class
	)
public class GetStudentActionCommand2 extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		System.out.println("GetStudentsActionCommand.doProcessAction()");

		_handleActionCommand(actionRequest);

		actionResponse.setRenderParameter("mvcPath", "/student_details.jsp");
	}

	private void _handleActionCommand(ActionRequest actionRequest) {

		long studentId = ParamUtil.getLong(actionRequest, "studentId");
		// Load the Student from DB
		actionRequest.setAttribute("student",
				"Hi this Student with id " + studentId + " has been loaded from the Database");
		actionRequest.setAttribute("comingFrom",
				com.liferaytutorials.controller.portlet.GetStudentActionCommand2.class.getName());

	}

}
