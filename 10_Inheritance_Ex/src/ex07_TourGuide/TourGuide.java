package ex07_TourGuide;

public class TourGuide{

  private Tour tour;
  
  public void sightseeing() {
    tour.sightseeing();
  }

  public void leisure() {
    tour.leisure();
  }

  public void meal() {
    tour.meal();
  }
  
  public void setTour(Tour tour) {
    this.tour = tour;
  }

}