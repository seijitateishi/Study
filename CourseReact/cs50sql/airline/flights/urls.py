from django.urls import path
from . import views
from .models import Flight

urlpatterns = [
    path("", views.index, name="index"),
    path("<int:flight_id>", views.flight, name="flight")
]