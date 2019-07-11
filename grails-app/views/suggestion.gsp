<%@ page import="com.careerfriend.infosystem.institutionMgt.Department" %>
<%@ page import="com.princely.examtimetable.Level" %>
<%@ page import="com.princely.examtimetable.Lecturer" %>


<!doctype html>
<html>
<head>
    <meta name="layout" content="template"/>
    <title>Welcome to CareerGuide</title>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
    <main class="center-block">
        <g:form class="col s12">
            <table>
                <thead>
                    <h3>O level Result</h3>
                    <tr>
                        <th data-field="number">Serial</th>
                        <th data-field="subject">Subject</th>
                        <th data-field="grade"> Score Grade</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>1</td>
                        <td>
                            <div class="input-field col s12">
                                <g:select name="department"
                                          from="${Department.list()}"
                                          optionValue="name"
                                          optionKey="id" />
                                <label>Select Subject 1</label>
                            </div>
                        </td>
                        <td>
                            <div class="input-field col s12">
                                <g:select name="department"
                                          from="${Department.list()}"
                                          optionValue="name"
                                          optionKey="id" />
                                <label>Select Department</label>
                            </div>
                        </td>
                    </tr>
                </tbody>
            </table>
            <div class="row center-align">
                <g:submitButton name="create" class="btn indigo text-white"
                                value="${message(code: 'default.button.create.label', default: 'Create')}"/>
            </div>
        </g:form>
    </main>
</body>
</html>
