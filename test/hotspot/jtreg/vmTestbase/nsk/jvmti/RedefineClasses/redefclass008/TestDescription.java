/*
 * Copyright (c) 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */


/*
 * @test
 *
 * @summary converted from VM Testbase nsk/jvmti/RedefineClasses/redefclass008.
 * VM Testbase keywords: [quick, jpda, jvmti, onload_only_caps, noras, redefine]
 * VM Testbase readme:
 * DESCRIPTION
 *     This test checks that the JVMTI function RedefineClasses()
 *     clears all breakpoints in the redefined class.
 *     The test creates a dummy instance of tested class redefclass008r
 *     Then the test sets several breakpoints in the tested class and
 *     redefines this class.
 *     Bytes of new version of the class redefclass008r are taken from
 *     the directory ./newclass.
 *     Finally, the test checks that all breakpoints were cleared after
 *     the redefinition.
 * COMMENTS
 *     The test was updated due to the bug 4441348.
 *     Ported from JVMDI.
 *
 * @library /vmTestbase
 *          /test/lib
 * @run driver jdk.test.lib.FileInstaller . .
 * @build nsk.jvmti.RedefineClasses.redefclass008
 *        nsk.jvmti.RedefineClasses.redefclass008r
 *
 * @comment compile newclassXX to bin/newclassXX
 * @run driver nsk.share.ExtraClassesBuilder
 *      newclass
 *
 * @run main/othervm/native -agentlib:redefclass008 nsk.jvmti.RedefineClasses.redefclass008 ./bin
 */

