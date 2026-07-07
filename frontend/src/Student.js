function Student(props){
    return(
        <>
         <h1>This is Student Component</h1>
         <h1>PersonName:{props.myname}</h1>
         <h1>RollNo:{props.myroll}</h1>
        </>
    )
}
export default Student;