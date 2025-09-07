package com.example.todoapp.ui.theme.data.models

import androidx.compose.ui.graphics.Color
import com.example.todoapp.ui.theme.HighPriorityColor
import com.example.todoapp.ui.theme.LowPriorityColor
import com.example.todoapp.ui.theme.MediumPriorityColor
import com.example.todoapp.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}