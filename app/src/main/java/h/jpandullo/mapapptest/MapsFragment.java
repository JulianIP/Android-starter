package h.jpandullo.mapapptest;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsFragment extends Fragment implements OnMapReadyCallback {
    GoogleMap nGoogleMap;
    View nView;
    MapView nMapView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        nView = inflater.inflate(R.layout.fragment_map, container, false);
        return nView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        nMapView = (MapView) nView.findViewById(R.id.map);

        if(nMapView != null) {
            nMapView.onCreate(null);
            nMapView.onResume();
            nMapView.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        MapsInitializer.initialize(getContext());

        nGoogleMap = googleMap;
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        googleMap.addMarker(new MarkerOptions().position(new LatLng(-34.611675,-58.449782)).title("Buenos Aires").snippet("TEST BA"));
        CameraPosition ba = CameraPosition.builder().target(new LatLng(-34.611675,-58.449782)).zoom(11).bearing(8).tilt(35).build();
        googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(ba));
    }
}