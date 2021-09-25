/**
 * Created by czz
 * Description:
 * User: 旧鹿麋
 * Date: 2021-09-24
 * Time: 19:19
 */
public class Score {
    Student[] s = new Student[1];

    public void setData(Student name, int index){
        s[index] = name;
    }
    public Student[] getData(){
        return s;
    }

    public Student SerchData(String name){
        for (int index = 0; index < s.length; index++) {
            if (name !=null && s[index] != null )
                if (s[index].name.equals(name)){
                    return s[index];
                }
        }
        return null;
    }
}
