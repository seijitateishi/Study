from django.urls import path
from . import views

app_name = "amihired"
urlpatterns = [
    path("", views.index, name="index")
]