import "./App.css";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {
  return (
    <div className="container">
      <div className="box">
        <CourseDetails />
      </div>

      <div className="box">
        <BookDetails />
      </div>

      <div className="box">
        <BlogDetails />
      </div>
    </div>
  );
}

export default App;