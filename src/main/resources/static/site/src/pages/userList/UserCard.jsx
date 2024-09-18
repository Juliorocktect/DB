import React from 'react'
import "./users.css"

function UserCard({name,age}) {
  return (
    <>
        <div className="user-card">
            <div className="upper-section">
                <img src="https://images6.alphacoders.com/933/thumb-1920-933628.jpg" alt="" />
            </div>
            <div className="bottom-section">
                <div className="user-card-left"><h1>{name}</h1></div>
                <div className="user-card-right"><h2>{age}</h2></div>
            </div>
        </div>
    </>
  )
}

export default UserCard