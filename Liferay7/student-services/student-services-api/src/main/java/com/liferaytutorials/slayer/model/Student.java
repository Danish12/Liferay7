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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Student service. Represents a row in the &quot;STUDENT_Student&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see StudentModel
 * @see com.liferaytutorials.slayer.model.impl.StudentImpl
 * @see com.liferaytutorials.slayer.model.impl.StudentModelImpl
 * @generated
 */
@ImplementationClassName("com.liferaytutorials.slayer.model.impl.StudentImpl")
@ProviderType
public interface Student extends StudentModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.liferaytutorials.slayer.model.impl.StudentImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Student, Long> STUDENT_ID_ACCESSOR = new Accessor<Student, Long>() {
			@Override
			public Long get(Student student) {
				return student.getStudentId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Student> getTypeClass() {
				return Student.class;
			}
		};
}