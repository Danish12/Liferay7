/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferaytutorials.slayer.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferaytutorials.slayer.service.http.StudentServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferaytutorials.slayer.service.http.StudentServiceSoap
 * @generated
 */
@ProviderType
public class StudentSoap implements Serializable {
	public static StudentSoap toSoapModel(Student model) {
		StudentSoap soapModel = new StudentSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setStudentId(model.getStudentId());
		soapModel.setName(model.getName());
		soapModel.setSollNumber(model.getSollNumber());
		soapModel.setEntryDate(model.getEntryDate());

		return soapModel;
	}

	public static StudentSoap[] toSoapModels(Student[] models) {
		StudentSoap[] soapModels = new StudentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StudentSoap[][] toSoapModels(Student[][] models) {
		StudentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StudentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new StudentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StudentSoap[] toSoapModels(List<Student> models) {
		List<StudentSoap> soapModels = new ArrayList<StudentSoap>(models.size());

		for (Student model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StudentSoap[soapModels.size()]);
	}

	public StudentSoap() {
	}

	public long getPrimaryKey() {
		return _studentId;
	}

	public void setPrimaryKey(long pk) {
		setStudentId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getStudentId() {
		return _studentId;
	}

	public void setStudentId(long studentId) {
		_studentId = studentId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public int getSollNumber() {
		return _sollNumber;
	}

	public void setSollNumber(int sollNumber) {
		_sollNumber = sollNumber;
	}

	public Date getEntryDate() {
		return _entryDate;
	}

	public void setEntryDate(Date entryDate) {
		_entryDate = entryDate;
	}

	private String _uuid;
	private long _studentId;
	private String _name;
	private int _sollNumber;
	private Date _entryDate;
}