package component

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun AddTaskSectionPreview() {
    MaterialTheme {
        AddTaskSection(
            modifier = Modifier.padding(16.dp),
            taskText = "",
            onTaskFieldChange = {},
            onAddClick = {}
        )
    }
}

@Composable
fun AddTaskSection(
    modifier: Modifier = Modifier,
    taskText: String,
    onTaskFieldChange: (String) -> Unit,
    onAddClick: () -> Unit,
) {
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        color = MaterialTheme.colors.surface,
        elevation = 4.dp,
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(
                value = taskText,
                onValueChange = onTaskFieldChange,
                placeholder = {
                    Text("Enter a task")
                }
            )

            Spacer(modifier = Modifier.width(16.dp))

            Button(onClick = onAddClick) {
                Text(text = "Add")
            }
        }
    }
}
