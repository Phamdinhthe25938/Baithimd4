getData();
function getData() {
    $.ajax({
        type: "GET",
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        url: "http://localhost:8080/staff/staffs",
        //xử lý khi thành công
        success: function (data) {
               showData(data);
        },
        error: function (err) {
            console.log(err)
        }
    })
}
function showData(data){
    let str="";
    for(let i=0;i<data.length;i++){
        str+= `
          <tr>
                    <td>${data[i].codeStaff}</td>
                    <td>${data[i].nameStaff}</td>
                    <td>${data[i].ageStaff}</td>
                    <td>${data[i].salaryStaff}</td>
                    <td>${data[i].branch.nameBranch}</td>
                    <td>
                        <a href="#" class="view" title="View" data-toggle="tooltip"><i class="material-icons">&#xE417;</i></a>
                       <a href="#editEmployeeModal" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                        <a href="#deleteEmployeeModal" onclick="confirmDelete(${data[i].codeStaff})" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                    </td>
                </tr>`
    }
    document.getElementById("contentBody").innerHTML=str;
}

function create() {
    let name = document.getElementById("name").value;
    let age = document.getElementById("age").value;
    let salary = document.getElementById("salary").value;
    let branch = document.getElementById("branch").value;
    console.log(name);
    console.log(age);
    let staff={
        nameStaff:name,
        ageStaff :age,
        salaryStaff:salary,
        branch:{
            idBranch:branch
        }
    }
    console.log(staff);
    $.ajax({
        type: "POST",
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        url: "http://localhost:8080/staff/addStaff",
        data: JSON.stringify(staff),
        //xử lý khi thành công
        success: function (data) {
            getData();
        },
        error: function (err) {
            console.log(err)
        }
    })
}
function deleteStaff() {
       let idStaffDelete= document.getElementById("staffDelete").value;
       console.log(idStaffDelete)
        $.ajax({
            type: "DELETE",
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            url: "http://localhost:8080/staff/deleteStaff/"+idStaffDelete,
            //xử lý khi thành công
            success: function (data) {
                getData();
            },
            error: function (err) {
                console.log(err)
            }
        })
}
function confirmDelete(id){
document.getElementById("staffDelete").value = id ;
    console.log(id)
}
function showEdit(){

}