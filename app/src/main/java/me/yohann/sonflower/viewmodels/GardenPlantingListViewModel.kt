package me.yohann.sonflower.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import me.yohann.sonflower.data.GardenPlantingRepository
import me.yohann.sonflower.data.PlantAndGardenPlantings

class GardenPlantingListViewModel(
    gardenPlantingRepository: GardenPlantingRepository
) : ViewModel() {
    val plantAndGardenPlantings: LiveData<List<PlantAndGardenPlantings>> =
        gardenPlantingRepository.getPlantedGardens()
}