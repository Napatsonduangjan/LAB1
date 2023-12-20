package com.example.lab1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab1.ui.theme.LAB1Theme

data class Person (val name:String, val imageId:Int, val studentId:String)
class MainActivity : ComponentActivity() {
    val persons: List<Person> = listOf<Person>(
        Person("นายกมล จันบุตรดี", R.drawable.ake, "643450063-8"),
        Person("นายจักรพรรดิ์ อนุไพร", R.drawable.dew, "643450065-4"),
        Person("นายเจษฎา ลีรัตน์", R.drawable.jatsada, "643450067-0"),
        Person("นายชาญณรงค์ แต่งเมือง", R.drawable.channarong, "643450069-6"),
        Person("นายณัฐกานต์ อินทรพานิชย์", R.drawable.wai, "643450072-7"),
        Person("นางสาวทัศนีย์ มลาตรี", R.drawable.thatsanee, "643450075-1"),
        Person("นายธนาธิป เตชะ", R.drawable.thanathip, "643450076-9"),
        Person("นายปรเมศวร์ สิทธิมงคล", R.drawable.make, "643450078-5"),
        Person("นายประสิทธิชัย จันทร์สม", R.drawable.prasittichai, "643450079-3"),
        Person("นางสาวพรธิตา ขานพล", R.drawable.beam, "643450080-8"),
        Person("นายพีระเดช โพธิ์หล้า", R.drawable.peet, "643450082-4"),
        Person("นายวิญญู พรมภิภักดิ์", R.drawable.winyu, "643450084-0"),
        Person("นางสาวศรสวรรค์ ไพรอนันต์", R.drawable.sornsawan, "643450085-8"),
        Person("นายศรันย์ ซุ่นเส้ง", R.drawable.saran, "643450086-6"),
        Person("นางสาวสุธาดา โสภาพ", R.drawable.suthada, "643450089-0"),
        Person("นายอภิทุน ดวงจันทร์คล้อย", R.drawable.ond, "643450092-1"),
        Person("นางสาวอมรรัตน์ มาระเหว", R.drawable.teyy, "643450094-7"),
        Person("นายอรัญ ศรีสวัสดิ์", R.drawable.arun, "643450095-5"),
        Person("นางสาวกฤติยา สินโพธิ์", R.drawable.krittiya, "643450320-4"),
        Person("นายก้องภพ ตาดี", R.drawable.model, "643450321-2"),
        Person("นายเกรียงศักดิ์ หมู่เมืองสอง", R.drawable.singto, "643450322-0"),
        Person(" นายเจษฏา พบสมัย", R.drawable.chetsada, " 643450323-8"),
        Person(" นายเทวารัณย์ ชัยกิจ", R.drawable.tewarun, " 643450324-6"),
        Person(" นายธนบดี สวัสดี\t", R.drawable.teammy, " 643450325-4\t"),
        Person(" นางสาวนภัสสร ดวงจันทร์\t", R.drawable.cream, " 643450326-2\t"),
        Person(" นางสาววรรณภา เบ้านาค\t", R.drawable.wannapa, " 643450330-1\t"),
        Person(" นายศุภชัย แสนประสิทธิ์\t", R.drawable.supachai, " 643450332-7\t"),
        Person(" นางสาวอฆพร ไร่ขาม\t", R.drawable.akaporn, " 643450334-3\t"),
        Person(" นายกฤตวัฒน์ อินทรสิทธิ์\t", R.drawable.kaofang, " 643450644-8\t"),
        Person(" นางสาวณัฐธิดา บุญพา\t", R.drawable.natthida, " 643450647-2\t"),
        Person(" นายรัตพงษ์ ปานเจริญ\t", R.drawable.tey, " 643450650-3\t"),

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LAB1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LazyColumn {
                        items(persons){
                                person -> PersonListItem(person)
                        }
                    }
                }
            }
        }
    }
}
@Composable
fun PersonListItem(data:Person){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(horizontal = 10.dp, vertical = 10.dp)) {
        Image(
            painter = painterResource(id = data.imageId),
            contentDescription = "Avatar image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape))
        Spacer(modifier = Modifier.width(16.dp))
        Column  {
            Text(data.name)
            Text(data.studentId)
        }}
}

