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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Student}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Student
 * @generated
 */
@ProviderType
public class StudentWrapper implements Student, ModelWrapper<Student> {
	public StudentWrapper(Student student) {
		_student = student;
	}

	@Override
	public Class<?> getModelClass() {
		return Student.class;
	}

	@Override
	public String getModelClassName() {
		return Student.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("studentId", getStudentId());
		attributes.put("name", getName());
		attributes.put("sollNumber", getSollNumber());
		attributes.put("entryDate", getEntryDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long studentId = (Long)attributes.get("studentId");

		if (studentId != null) {
			setStudentId(studentId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Integer sollNumber = (Integer)attributes.get("sollNumber");

		if (sollNumber != null) {
			setSollNumber(sollNumber);
		}

		Date entryDate = (Date)attributes.get("entryDate");

		if (entryDate != null) {
			setEntryDate(entryDate);
		}
	}

	@Override
	public Student toEscapedModel() {
		return new StudentWrapper(_student.toEscapedModel());
	}

	@Override
	public Student toUnescapedModel() {
		return new StudentWrapper(_student.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _student.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _student.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _student.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _student.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Student> toCacheModel() {
		return _student.toCacheModel();
	}

	@Override
	public int compareTo(Student student) {
		return _student.compareTo(student);
	}

	/**
	* Returns the soll number of this student.
	*
	* @return the soll number of this student
	*/
	@Override
	public int getSollNumber() {
		return _student.getSollNumber();
	}

	@Override
	public int hashCode() {
		return _student.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _student.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new StudentWrapper((Student)_student.clone());
	}

	/**
	* Returns the name of this student.
	*
	* @return the name of this student
	*/
	@Override
	public java.lang.String getName() {
		return _student.getName();
	}

	/**
	* Returns the uuid of this student.
	*
	* @return the uuid of this student
	*/
	@Override
	public java.lang.String getUuid() {
		return _student.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _student.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _student.toXmlString();
	}

	/**
	* Returns the entry date of this student.
	*
	* @return the entry date of this student
	*/
	@Override
	public Date getEntryDate() {
		return _student.getEntryDate();
	}

	/**
	* Returns the primary key of this student.
	*
	* @return the primary key of this student
	*/
	@Override
	public long getPrimaryKey() {
		return _student.getPrimaryKey();
	}

	/**
	* Returns the student ID of this student.
	*
	* @return the student ID of this student
	*/
	@Override
	public long getStudentId() {
		return _student.getStudentId();
	}

	@Override
	public void persist() {
		_student.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_student.setCachedModel(cachedModel);
	}

	/**
	* Sets the entry date of this student.
	*
	* @param entryDate the entry date of this student
	*/
	@Override
	public void setEntryDate(Date entryDate) {
		_student.setEntryDate(entryDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_student.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_student.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_student.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the name of this student.
	*
	* @param name the name of this student
	*/
	@Override
	public void setName(java.lang.String name) {
		_student.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_student.setNew(n);
	}

	/**
	* Sets the primary key of this student.
	*
	* @param primaryKey the primary key of this student
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_student.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_student.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the soll number of this student.
	*
	* @param sollNumber the soll number of this student
	*/
	@Override
	public void setSollNumber(int sollNumber) {
		_student.setSollNumber(sollNumber);
	}

	/**
	* Sets the student ID of this student.
	*
	* @param studentId the student ID of this student
	*/
	@Override
	public void setStudentId(long studentId) {
		_student.setStudentId(studentId);
	}

	/**
	* Sets the uuid of this student.
	*
	* @param uuid the uuid of this student
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_student.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StudentWrapper)) {
			return false;
		}

		StudentWrapper studentWrapper = (StudentWrapper)obj;

		if (Objects.equals(_student, studentWrapper._student)) {
			return true;
		}

		return false;
	}

	@Override
	public Student getWrappedModel() {
		return _student;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _student.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _student.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_student.resetOriginalValues();
	}

	private final Student _student;
}