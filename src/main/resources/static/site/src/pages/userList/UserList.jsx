import React, { useEffect, useState } from 'react'
import UserCard from './UserCard'


function UserList() {
  const [users,setUsers] = useState([""]);
  const[load,setLoad] = useState(false);
  useEffect(()=>{
    fetch(
      "https://miniature-space-waddle-9rgx9p6pww6f7xp9-9090.app.github.dev/users"
    )
      .then((response) => response.json())
      .then((result) => {
        setUsers(result);
        setLoad(true);
        console.log(result);
      })
      .catch((error) => console.log("error", error));

  },[]);

  return (
    <div>
        <div className="user-grid">
            <UserCard name={"Etienne"} age={17}></UserCard>
            <UserCard name={"Etienne"} age={17}></UserCard>
            <UserCard name={"Etienne"} age={17}></UserCard>
            <UserCard name={"Etienne"} age={17}></UserCard>
            <UserCard name={"Etienne"} age={17}></UserCard>
            <UserCard name={"Etienne"} age={17}></UserCard>
            <UserCard name={"Etienne"} age={17}></UserCard>
            
        </div>  
    </div>
  )
}

export default UserList


