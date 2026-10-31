package uz.muhsinov_job.googlelessontaskmanager.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.muhsinov_job.googlelessontaskmanager.R
import uz.muhsinov_job.googlelessontaskmanager.ui.ui.theme.GoogleLessonTaskManagerTheme
import uz.muhsinov_job.googlelessontaskmanager.ui.ui.theme.color1
import uz.muhsinov_job.googlelessontaskmanager.ui.ui.theme.color2
import uz.muhsinov_job.googlelessontaskmanager.ui.ui.theme.color3
import uz.muhsinov_job.googlelessontaskmanager.ui.ui.theme.color4

class QuadrantActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GoogleLessonTaskManagerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    QuadrantApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun QuadrantApp(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Row(modifier = Modifier.weight(1f)) {
            Quadrant(
                txt1 = stringResource(R.string.text_composable),
                txt2 = stringResource(R.string.displays_text_and_follows_the_recommended_material_design_guidelines),
                color = color1,
                modifier = Modifier.weight(1f)
            )
            Quadrant(
                txt1 = stringResource(R.string.image_composable),
                txt2 = stringResource(R.string.creates_a_composable_that_lays_out_and_draws_a_given_painter_class_object),
                color = color2,
                modifier = Modifier.weight(1f)
            )
        }
        Row(modifier = Modifier.weight(1f)) {
            Quadrant(
                txt1 = stringResource(R.string.row_composable),
                txt2 = stringResource(R.string.a_layout_composable_that_places_its_children_in_a_horizontal_sequence),
                color = color3,
                modifier = Modifier.weight(1f)
            )
            Quadrant(
                txt1 = stringResource(R.string.column_composable),
                txt2 = stringResource(R.string.a_layout_composable_that_places_its_children_in_a_vertical_sequence),
                color = color4,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun Quadrant(txt1: String, txt2: String, color: Color, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = txt1,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = txt2,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    GoogleLessonTaskManagerTheme {
        QuadrantApp()
    }
}
