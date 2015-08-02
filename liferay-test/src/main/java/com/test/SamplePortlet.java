package com.test;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class SamplePortlet
 */
public class SamplePortlet extends MVCPortlet {

	@Override
	public void processAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		System.out.println("****************** SamplePortlet.processAction() *********************");
		super.processAction(actionRequest, actionResponse);
	}
 

}
